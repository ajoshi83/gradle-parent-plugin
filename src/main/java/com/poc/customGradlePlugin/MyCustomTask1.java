package com.poc.customGradlePlugin;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class MyCustomTask1 extends DefaultTask {
    @TaskAction
    public void myCustomTask1() {
        System.out.println("Hello! From Custom Task1");
    }
}
