# Safe Chain Maven Test Plugin

Minimal Maven plugin intended only for Safe Chain testing.

## Coordinates

- `groupId`: `org.aikido.safechain`
- `artifactId`: `safe-chain-test-plugin`
- `version`: `0.0.1-security`

These coordinates can be added to Aikido's malware list for end-to-end blocking validation.

## Build

```bash
mvn clean verify
```

## Local Publish

```bash
mvn clean deploy
```

## Signed Release Publish

```bash
mvn -Prelease clean deploy
```

This plugin intentionally provides only a no-op goal:

- `safechain-test:ping`
