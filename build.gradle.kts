plugins {
    application
}

application {
    mainClass.set("HelloRecords")
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}


tasks.register<JavaExec>("DemoNPEBetterErrorMsg") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j15.DemoNPEBetterErrorMsg")
}

tasks.register<JavaExec>("DemoRecords") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j16.DemoRecords")
}

tasks.register<JavaExec>("DemoSealedInterface") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j16.DemoSealedInterface")
}

