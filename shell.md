# Quick Start Scripting Tool

# Introduction

Using the `start.sh` script, you can quickly and easily run and build HRNetwork.

If you already downloaded the `FullNode.jar`, you can use `start.sh` to run it, or if you have not downloaded HRNetwork source code or jar packages, you can use `start.sh` to download the source code, compile, run or get the latest release version in the form of a `jar package ` and run.

***

# Usage

## Examples

* Start the `FullNode.jar` (`start.sh`, `config.conf` and `FullNode.jar` in the same directory.)

  ```
  sh start.sh --run
  ```
  
  Start the servive with options.
  
  ```
  sh start.sh --run -j /data/FullNode.jar -c /data/config.conf -d /data/output-directory
  ```
  
* Stop the `FullNode.jar`

  ```
  sh start.sh --stop
  ```

* Get the latest version of `FullNode.jar` and start it

  ```
  sh start.sh --release --run
  ```
  
* Clone the source code, compile `HRN`, and generate `FullNode.jar` and start it

  ```
  sh start.sh -cb --run
  ```



## Options

### Service operation

* `--run` 

  start the service

* `--stop`

  stop the service

* `-c`

  Specify the configuration file, by default it will load the `config.conf` in the same directory as `FullNode.jar`

* `-d`

  Specify the database storage path, The default path is the same directory where `FullNode.jar` is located.

* `-j`

  Specify the jar package, default value is the `FullNode.jar` in the current path.

* `-mem`

  Specify the maximum memory of the `FullNode.jar` service in`MB`, jvm's startup maximum memory will be adjusted according to this parameter.

### build project

* `-cb`

  Clone the latest source code and compile.

* `--release`

  Get the latest released version of the `jar` package from github.


### rebuild the manifest

* `-d`

  specify the `output-directory` db directory

* `-m`

  specify the minimum required manifest file size ，unit:M，default：0

* `-b`

  specify the batch manifest size,default：80000

* `-dr` or `--disable-rewrite-manifest`  
  disable rewrite manifest

***

## How to use

* Local mode

  Start the service using the local Jar package

* Online mode

  Get the latest code or latest release from github and start the service
