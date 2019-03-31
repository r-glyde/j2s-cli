# j2s-cli

CLI parser for jinja2 template files using [jinjava](https://github.com/HubSpot/jinjava).

```
$ java -jar j2s-cli-v0.1.jar
Usage: j2s-cli [options]

  -i, --input <file>   input file
  -o, --output <file>  optional output file - do not set to use stdout
```

Variables in the jinja2 template will be read from the environment and can also be passed as:
```
$ key1=something java -jar j2s-cli-v0.1.jar
```
