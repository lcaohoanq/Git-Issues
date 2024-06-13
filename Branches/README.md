```bash
# create the new branch
git branch <branch_name>

# show the current branch
git branch

# show all existing branch
git branch -a

# more branch infomation
git branch -v
```

# checkout and switch: the same
```bash
git checkout <branch_name>

git switch <branch_name>

# create and move to created branch
git checkout -b <branch_name>

git switch -c <branch_name>
```

# delete & rename branch
## delete
- need to switch to another branch that need delete
`-d`: --delete
```bash
git switch -c deleteMe
git branch -d deleteMe
# error: Cannot delete branch 'deleteMe' checked out at ....

# need to switch to another branch
git switch master
git branch -d deleteMe
```
`-D`: --delete --force

## rename
- stay in current branch need to rename
```bash
git checkout feature/issue-1/add-login-api
git branch -m hello

git status
# On branch hello ~
```

