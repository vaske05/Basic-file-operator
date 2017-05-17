# Basic-file-ops

-You are given a folder (potentially containing subfolders, each) containing a bunch of .txt files named like PSIML_XYZ.txt, where XYZ (between 000 and 999) encodes a number of occurrences of "PSIML" string in that particular file (e.g. PSIML_003.txt suggests that "PSIML" string occurs exactly 3 times in that file). Given the folder's path, find number of "correctly" named .txt files (i.e. the ones named like PSIML_XYZ.txt in which "PSIML" does indeed occur exactly XYZ times).

->Input format
Path to a folder containing only .txt files named like PSIML_XYZ.txt will be given through command line input. The files may optionally be scattered within the folder's subfolder tree.

<-Output format
Total number of "correctly" named .txt files should be printed to command line output.
