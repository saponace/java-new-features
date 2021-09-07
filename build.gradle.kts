plugins {
    application
}

application {
    mainClass.set("HelloRecords")
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}

// Java 9
tasks.register<JavaExec>("DemoPrivateMethodInInterface") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoPrivateMethodInInterface")
}

tasks.register<JavaExec>("DemoDiamondOperatorForAnonymousInnerClasses") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoDiamondOperatorForAnonymousInnerClasses")
}

tasks.register<JavaExec>("DemoNewTryWithResources") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoNewTryWithResources")
}

tasks.register<JavaExec>("DemoNewOptionalMethods") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoNewOptionalMethods")
}

tasks.register<JavaExec>("DemoCollectionFactoryMethods") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j9.DemoCollectionFactoryMethods")
}

// Java 15
tasks.register<JavaExec>("DemoNPEBetterErrorMsg") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j15.DemoNPEBetterErrorMsg")
}

// Java 15
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

