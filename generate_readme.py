import glob

java_links = {}
contest_problems_map = {}

def gather_java_file_path():
    java_file_root_path ="./src/main/java/com/wkodate/atcoder"
    java_files = glob.glob("{}/*/*".format(java_file_root_path))
    for file in java_files:
        contest_title = file.split("/")[7]
        if contest_title.startswith("_"):
            continue
        problem = file.split("/")[8]
        pset = set()
        if contest_title in contest_problems_map:
            pset = contest_problems_map.get(contest_title)
            pset.add(problem)
        else:
            pset = set([problem])
        contest_problems_map[contest_title] = pset
        contest_problem = "{}/{}".format(contest_title, problem)
        java_links[contest_problem] = "{}/Main.java".format(file)

def update_readme(java_links, contest_plist_map):
    s = "AtCoder\n===\n\n ## Java\n| | A | B | C | D | E | F | G |\n| -- | -- | -- | -- | -- | -- | -- | -- |\n"
    for c, pset in contest_plist_map:
        s += "| {} ".format(c)
        for p in ["a", "b", "c", "d", "e", "f", "g"]:
            java_filepath = ""
            if p in pset:
                java_filepath = "[solution]({})".format(java_links["{}/{}".format(c, p)])
            s += "| {} ".format(java_filepath)
        s += "| \n"
    
    with open('./README.md', mode='w') as f:
        f.write(s)
    f.close


gather_java_file_path()
sorted_contest_problem_list_map = sorted(contest_problems_map.items(), key=lambda x:x[0])
update_readme(java_links, sorted_contest_problem_list_map)