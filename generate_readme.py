import glob
import re

java_links = {}
contest_problem_map = set()

def gather_java_file_path():
    java_file_root_path ="./src/main/java/com/wkodate/atcoder"
    java_files = glob.glob("{}/*/*".format(java_file_root_path))
    for file in java_files:
        contest_title = file.split("/")[7]
        if contest_title.startswith("_"):
            continue
        problem = file.split("/")[8]
        contest_problem = "{}/{}".format(contest_title, problem)
        contest_problem_map.add(contest_problem)
        java_links[contest_problem] = "{}/Main.java".format(file)

def update_readme(java_links):
    s = "AtCoder\n===\n\n| a | b | c | d | e | f |\n| -- | -- | -- | -- | -- | -- |\n"
    for k, v in sorted:
        java_filepath = ""
        if k in java_links:
            java_filepath = "[solution]({})".format(java_links.get(k))
        s += "| {} | {} | {} | {} | {} | {} | \n".format(str(k), v, java_filepath)
    
    with open('./README.md', mode='w') as f:
        f.write(s)
    f.close


gather_java_file_path()
sorted = sorted(contest_set.items(), key=lambda x:x[0])
update_readme(java_links)