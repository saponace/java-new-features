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

// Java 10
tasks.register<JavaExec>("DemoLocalTypeInference") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j10.DemoLocalTypeInference")
}

// Java 14
tasks.register<JavaExec>("DemoSwitchExpressions") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j14.DemoSwitchExpressions")
}

// Java 15
tasks.register<JavaExec>("DemoNPEBetterErrorMsg") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j15.DemoNPEBetterErrorMsg")
}

tasks.register<JavaExec>("DemoTextBlock") {
    dependsOn("classes")
    jvmArgs("--enable-preview")
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("j15.DemoTextBlock")
}

// Java 16
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

