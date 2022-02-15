import glob

java_links = {}
cpp_links = {}
java_contest_problems_map = {}
cpp_contest_problems_map = {}

def gather_java_file_path():
    java_file_root_path ="./java/src/main/java/com/wkodate/atcoder"
    java_files = glob.glob("{}/*/*".format(java_file_root_path))
    for file in java_files:
        contest_title = file.split("/")[8]
        if contest_title.startswith("_"):
            continue
        problem = file.split("/")[9]
        pset = set()
        if contest_title in java_contest_problems_map:
            pset = java_contest_problems_map.get(contest_title)
            pset.add(problem)
        else:
            pset = set([problem])
        java_contest_problems_map[contest_title] = pset
        contest_problem = "{}/{}".format(contest_title, problem)
        java_links[contest_problem] = "{}/Main.java".format(file)

def gather_cpp_file_path():
    cpp_file_root_path ="./cpp"
    cpp_files = glob.glob("{}/*/*.cpp".format(cpp_file_root_path))
    for file in cpp_files:
        contest_title = file.split("/")[2]
        if contest_title.startswith("_") or contest_title in ["apg4b", "tutorial"]:
            continue
        problem = file.split("/")[3].split(".cpp")[0]
        pset = set()
        if contest_title in cpp_contest_problems_map:
            pset = cpp_contest_problems_map.get(contest_title)
            pset.add(problem)
        else:
            pset = set([problem])
        cpp_contest_problems_map[contest_title] = pset
        cpp_links["{}/{}".format(contest_title, problem)] = file

def update_readme(java_links, java_contest_plist_map, cpp_contest_plist_map):
    s = "AtCoder\n===\n\n ## Java\n\n| | A | B | C | D | E | F | G |\n| -- | -- | -- | -- | -- | -- | -- | -- |\n"
    for c, pset in java_contest_plist_map:
        s += "| {} ".format(c)
        for p in ["a", "b", "c", "d", "e", "f", "g"]:
            java_filepath = ""
            if p in pset:
                java_filepath = "[solution]({})".format(java_links["{}/{}".format(c, p)])
            s += "| {} ".format(java_filepath)
        s += "|\n"
    
    s += "\n ## C++\n\n| | A | B | C | D | E | F | G |\n| -- | -- | -- | -- | -- | -- | -- | -- |\n"
    for c, pset in cpp_contest_plist_map:
        s += "| {} ".format(c)
        for p in ["a", "b", "c", "d", "e", "f", "g"]:
            cpp_filepath = ""
            if p in pset:
                cpp_filepath = "[solution]({})".format(cpp_links["{}/{}".format(c, p)])
            s += "| {} ".format(cpp_filepath)
        s += "|\n"

    with open('./README.md', mode='w') as f:
        f.write(s)
    f.close


gather_java_file_path()
sorted_java_contest_problem_list_map = sorted(java_contest_problems_map.items(), key=lambda x:x[0])
gather_cpp_file_path()
sorted_cpp_contest_problem_list_map = sorted(cpp_contest_problems_map.items(), key=lambda x:x[0])
update_readme(java_links, sorted_java_contest_problem_list_map, sorted_cpp_contest_problem_list_map)
