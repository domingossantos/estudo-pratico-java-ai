plugins { java }
group = "dev.javaelite"
version = "0.1.0"
java { toolchain { languageVersion.set(JavaLanguageVersion.of(21)) } }
tasks.test { useJUnitPlatform() }
