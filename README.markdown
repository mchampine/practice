*This is my first practice repo on github, establishing the workflow with 2 clients (home,work) and the ability to push changes from each to github and pull to each from the server.*

How To Setup 2 Machines to share a repo
=======================================
* Note: making the new repo gives useful hints.
* Note: add both starts tracking file and stages files. -a auto stages 

Both Machines - SSH
-------------------
	ssh-keygen -C "my@email.com" -t rsa
Note: login to github and add the resulting public keys for each client

Both Machines - git Setup
-------------------------
	git config --global user.name "my name"
	git config --global user.email "my@email.com"
Note: these can be done locally to without the --global flag

Machine 1
---------
	mkdir mydir; cd mydir
	git init                 //initialize this repo
	git add .                // . recursively adds all the files
	git commit -m 'initial'  //commit changes

Now push it:
	git remote add origin git@github.com:mchampine/practice.git //name online repo "origin" 
	git push origin master   //push local master branch to remote origin (on the server)

Machine 2:
---------
	git clone git@github.com:mchampine/practice.git  //clone via the private url

Add a file, add it to staging, commit and push it to the server:

	vi README
	git add README
	git commit -m 'added a readme'
	git push origin master

Edit a file, stage and commit, push it:

	vi README
	git commit -a -m 'a comment'  //commit all changes and deletions 
	git push origin master   //push to the server

Machine 1:
---------
	git pull                      //don't have to specify where
<Do some edits>
	git commit -a -m 'a comment'  //commit all changes and deletions 
	git push                     

Repeat over and over indefinitely...
