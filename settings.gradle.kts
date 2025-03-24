rootProject.name = "lmdlc-java-spring-demos"

file("subprojects").listFiles()?.forEach { dir ->
    if (dir.isDirectory) {
        include(dir.name)
        project(":${dir.name}").projectDir = dir
    }
}

