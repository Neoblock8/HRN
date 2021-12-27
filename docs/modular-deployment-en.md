# How to deploy HRNetwork after modularization

After modularization, HRNetwork is launched via shell script instead of typing command: `java -jar FullNode.jar`.

*`java -jar FullNode.jar` still works, but will be deprecated in future*.

## Download

```
git clone git@github.com:Neoblock8/HRN.git
```

## Compile

Change to project directory and run:
```
./gradlew build
```
HRN-1.0.0.zip will be generated in HRN/build/distributions after compilation.
