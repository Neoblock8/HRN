# Contributing to HRNetwork

HRNetwork is an open source project.

It is the work of contributors. We appreciate your help!

Here are instructions to get you started. They are not perfect, so
please let us know if anything feels wrong or incomplete.

## Contribution guidelines
First of all, HRNetwork follows GitFlow, the branches description in the HRNetwork project are listed as follow:

- ``master`` branch:
This branch contains the latest code released to the production environment. It can only be merged, and can not be modified directly in this branch.

- ``develop`` branch:
This branch is the main development branch. It contains the complete code that is going to release. It can only be merged, and can not be modified directly in this branch.

- ``feature`` branch:
This branch is used to develop new features. It is created based on ``develop`` branch. Once the development is finished, it should be merged into ``develop`` branch, and then delete the branch.

- ``release`` branch:
This is the branch that is going to be released. It is created based on ``develop`` branch. In this branch, small fix and modification of final version of metadata is allowed. When the code is released, this branch should be merged into ``master`` branch (tag needed) and ``develop`` branch. The final test before release uses this branch.

- ``hotfix`` branch:
This branch is used to fix a bug when an online bug is found. It is created based on ``master`` branch. When bug fix is done, it should be merged into ``master`` branch(as a new release) and ``develop`` and then delete the branch. branch.
