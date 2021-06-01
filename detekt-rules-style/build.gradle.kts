plugins {
    module
}

dependencies {
    compileOnly(projects.detektApi)
    compileOnly(projects.detektMetrics)
    testImplementation(projects.detektMetrics)
    testImplementation(projects.detektTest)
    testImplementation(libs.mockk)

    constraints {
        testImplementation("net.bytebuddy:byte-buddy:1.11.0") {
            because("version 1.10.14 (pulled in by mockk 1.11.0) is not Java 16 compatible")
        }
    }
}