# kryo-juniper
Kryo 5.x support for classes from [juniper](https://github.com/tommyettinger/juniper)

## Get it

Use JitPack.io as your repository (which gdx-liftoff projects already can do) and depend on:
```
implementation "com.github.tommyettinger:kryo-juniper:0.10.8.2"
```

This depends on Kryo 5.6.2 and juniper 0.10.8 .
The juniper dependency transitively pulls in digital 0.10.3 .

## Usage

See [the test class for EnhancedRandom generators](src/test/java/com/github/tommyettinger/kryo/juniper/RandomTest.java)
and [the test class for Distribution](src/test/java/com/github/tommyettinger/kryo/juniper/DistributionTest.java) that
test each of the Serializer classes here.

## Older Versions

See [kryo-more](https://github.com/tommyettinger/kryo-more) for older releases.

## License

[Apache 2.0](LICENSE).