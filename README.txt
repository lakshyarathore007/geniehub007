git init = Powers your folder to be managed by git and initializez a new empty rep.
It also creates a .git folder that has all the relevent logic to manage versions of your project.

Working area : There can be a bunch of fiules that are not currently managed by git.
it means that changes done or to be done in those files are not managed by git yet.
A file which is in working area is considered to be not in the staging area.
when we do 'git status' and wee seer abunch of 'untracked files' then these are actually called to be in the working area.

Staging area = what all files are going to be part of the next version that we will create.
the staging area is the place where git knows what changes will be done from the last version to the next version.

Repository area = this area actually contains the detalis of all your previous registered version.
and the files in this area, git already manages them and knows their version history.

git add <file> = moves files from working to staging area

git rm --cached <file> = moves files from staging to working area.

commit = it is a particular version of the projec. IT captures a snapshot of the project's staged changes and creates a version out of it.

git commit 

git log = list down all the commits(version) of the repository.

git restore <file>  = is going to delete which is not commit yet and is in staging area.

git restore --staged <file>  = it removes files from changes from staging area to the working area. 
this only works if changes are in your staging area.

git remote = list down all the remote connections names

Remote connections : it helps you to link two git repositories for uploading and downloading changes.
from each otherwise

git remote add <name of remote> <link>

git remote rm <name of remote> = deletes a remote

git remote rename <oldname> <newmane>







