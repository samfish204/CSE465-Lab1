# 465-java-recursion

Write a recursive Java program to print all 8-digit  binary numbers.  No loops allowed. 

# Getting the Assignment

1. Go to https://gitlab.csi.miamioh.edu/cse465 and fork this repository into your own account. 

2. Add femianjc@miamioh.edu as an 

# Submitting Your Code
1. Make sure your code passes all of the tests. 
2. Submit a link to your gitlab repository to canvas. 



# Testing Your Code
You may use a docker image I created to test your code, or you may install the GNU Make and the language interpreters or compilers needed on your own system. 

# Testing with Docker

First, if you are on windows, install WSL.  
Then, [install docker](https://docs.docker.com/get-docker/) on your system.

Second, run the test script for your operating system:
- windows: type `test.cmd`
- bash (osx, linux): type `./test.sh`
> NOTE: The tests will fail until you have completed the assigment

The scripts simple run GNU Make in a docker container using an Image I have created on dockerhub, mapping your current directoy to the  `/usr/src` folder in the docker container, which will be the current folder. 

```bash
# test.sh
docker run -v ${PWD}:/usr/src femianjc/cse465 make 
```

You can also debug and test using the container by leaving out the word `make` above. 