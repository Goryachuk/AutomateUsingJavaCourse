This file describes Functional Design. It will be updated in future. Its scope will be more detailed and enlarged. In addition, this document describes tasks and their implementation.
Agenda*
Task #1 – Setup environment
Task #2 - Functional Design
Task #3 - To add exceptions.
Task #4 - To change interface for Posts. It must have dynamic size.
Task #5 - TBD

* - it will be updated step by step, from task to task. Now it demonstrates current situation.
Bellow all tasks.


Task #1
Setup environment 
IntelliJ IDEA (select community) http://www.jetbrains.com/idea/download/
JDK http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Lectures \\fs\KnowledgeBase\Automation_for_QA\ 
GitHUB https://github.com/Dmitry404/AutomateUsingJavaCourse
https://github.com/Goryachuk/AutomateUsingJavaCourse
http://git-scm.com/download/win
Before you start please do the following:
1.	Create an GitHub account if you still don't have one - https://github.com/join
2.	Learn how to use Git and GitHub passing all challenges there – https://try.github.com
3.	Install Git on your local environment - http://git-scm.com/downloads
4.	Learn how to fork repositories - https://help.github.com/articles/fork-a-repo
5.	Learn how to work with pull-requests - https://help.github.com/articles/using-pull-requests
Run GitBash, use next commands
cd c:\DG\AutomateUsingJavaCourse
git remote -v
git remote add upstream https://github.com/Dmitry404/AutomationUsingJavaCourse.git
git remote -v
git fetch upstream
git checkout master
git status
Copy files into your folder
git add *.txt
git status
git commit -m "created test.txt"
git push


Task #2
Functional Design
“As the most of you probably know, there is a sort of web-site that is called “web blog”. If you don’t, there is an article in Wikipedia http://en.wikipedia.org/wiki/Blog During this course we’re going to create a simple blog, then cover it with automation tests. This week your task will be to create an OOP model of simple web-blog. Start with the main class named WebBlog, then create as many classes as you think is enough for simple blog. Consider creating different types of posts, e.g. regular page, external-URL and post-image. There are no strict rules, so involve your imagination and knowledge what a web-blog is. In order to refer to a bunch of objects, e.g. pages, use an array which is built-in construction in Java.”

For demonstration / implementation OOP class model – there are several classes. They are:
MainClass – it is main class which “plays” a workflow:
	Author creation -> Web Blog Description creation -> Web Blog creation that linked Author and Description -> Adding a Text Post -> Adding a Text Post -> Adding URL Post -> Adding Image Post -> Deleting Text Post -> Editing URL Post -> Adding a Comment to the Text Post …
WebBlog – class that describes main points of the entity. It uses:
	AuthorEntity – class that keeps the common information about author of the WebBlog. It can set and return this information: First Name and Last Name.
	DescriptionOfWebBlog – class that keeps common information about description of the WebBlog. It can set and return this information: Name and Goal of the WebBlog.
	PostEntity – class that contains a post entity. It can be as Text, URL and Image.
	CommentEntity - class that allows manipulating by comments: Add / Edit / Delete. All comments can be linked to a Post of the WebBlog. All comments are of the text format. 

For demonstration / implementation “abstract classes” – PostEntity is an abstract class, three other classes extend it. They are TypeOfPoistImage, TypeOfPostText, TypeOfPostUrl.

For demonstration / implementation “interface” – all Posts will be kept in “stack”.

Task #3
To add exceptions.
Task #4
To change interface for Posts. It must have dynamic size.

