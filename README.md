# Sustopia

A sussy 1.16.5 [Airplane](https://airplane.gg) fork aimed at higher performance and better security while still relatively stable.

its just me, who knows nothing bout java, copypastin patches lel

## Downloading

Grab one from [the Semaphore CI](https://kurumifake.semaphoreci.com/artifacts/projects/ba484b45-67a9-4751-bd67-4e94e3bbc612)

## Building

```bash
./gradlew applyPatches && ./gradlew build && ./gradlew paperclip
# or on windows
gradle.bat applyPatches && gradle.bat build && gradle.bat paperclip
```

This will output a distributable JAR at `sustopia-paperclip.jar`, right in your main directory.

## Questions?

If you need help or run into issues, feel free to ask me: KurumiFake#7005 on Discord

### Licensing

Patches are licensed under GPL-3.0.

All other files are licensed under MIT.
