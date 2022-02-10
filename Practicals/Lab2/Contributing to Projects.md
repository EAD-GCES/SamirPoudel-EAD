# Contribuiting to Open Source Project

## 1. Sign in to GitHub

Create an account or Sign in (if the account is already created) to GitHub or a similar platform such as GitLab, Bitbucket.

## 2. Fork the Project Repository

Go to the project repository and click **Fork**
your account.

## 3. Clone the forked repository

Clone the forked repository from personal your GitHub account into your local machine.

### Methods to clone a repository

- Click **Clone or download** or
- Use **git command** `git clone <forked_repo_url>`

## 4. Navigate to your local repository

## 5. Check that your fork is the "*origin*" remote

You are going to be synchronizing your local repository with both the project repository (on GitHub) and your fork (also on GitHub)

The URLs that point to these repositories are called "*remotes*". The project repository is called the "*upstream*" remote, and your fork is usually called the "*origin*" remote.

When you cloned your fork, your fork is automatically set as the "*origin*" remote.

Use `git remote -v` to show current remotes

Use command `git remote add <name> <fork_url>`.
`git remote add origin *fork_repo_url*` adds a remote named *origin* for the repository at *fork_repo_url*.

## 6. Add the project repository as "*upstream*" remote

- Go to the original project repository

- Click **Clone or download**

- Copy the URL of the repository

- Use command `git remote add upstream *main_project_url*`

## 7. Pull the latest changes from the upstream into your local repository

It is a good practice to first synchronize your local repository with the project repository. So use `git pull upstream master` or `git pull upstream main` depending upon the main branch name of the project repository to pull the latest changes from the repository.

## 8. Create a new branch

Usually, a new branch is created for making changes or adding certain features rather than directly making changes to the main branch.

Use `git branch <new_branch_name>` or `git checkout -b <new_branch_name>` to create a new branch.

To check local branches, use the command `git branch`

## 9. Make changes to your local repository

## 10. Commit your changes

After making certain changes to the project use the `git add` command to stage changes. Then use `git commit -m "Commit description"` to commit changes.

## 11. Push your changes to your fork

After making necessary changes, use `git push origin <branch_name>` to push changes to your forked GitHub repository.

## 12. Begin the pull request

Return to your fork on GitHub and refresh the page.

Click the **Compare & pull request** button to begin the pull request.

(If you don't see the button, switch to your branch and then click the **New pull request** button)

## 13. Create the pull request

When opening a "*pull request*", you are making a "request" that the project repository "pull" changes from your fork. You will see that the project repository is listed as the "*base repository*", and your fork is listed as the "*head repository*"

Describe changes you made in detail. After everything is good, click the **Create pull request** button.

## 14. Review the pull request

You have now created a pull request, which is stored in the project's repository.

Review changes you have made to finalize the pull request.

If you missed some details, you can click edit pull request description.

## 15. Add more commits to your pull request

You can continue to add more commits to your pull request.

Go to your local repository and use the `git branch` to see the current working branch. Change branch if you are not in required branch using `git checkout <branch_name>`

Then make changes, commit and push to your fork (Step 9-11)

When you check the pull request on GitHub, your new commits have been automatically added to the pull request.

## 16. Discuss the pull request

Discuss the pull request with the project maintainers.

Click the **Resolve conversation** button once you have addressed any specific requests.

## 17. Delete your branch from your fork

If your pull request is accepted, then it will be merged into the project's main branch and your pull request will be closed.

You have an option to delete your branch from your fork since is no longer of any use.

Click the **Delete branch** button to delete your branch from your fork.

## 18. Delete your branch from your local repository

Since your branch is of no use, you might as well delete the branch from the local repository.

## 19. Synchronize your fork with the project repository

Your fork is out of sync with the project repository's main branch since the main branch is updated.

To sync, use `git pull upstream <main_branch_name>`. Then push changes to your fork repository using `git push origin <main_branch_name>`.
