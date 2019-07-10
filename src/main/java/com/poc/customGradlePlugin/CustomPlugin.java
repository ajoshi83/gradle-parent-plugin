package com.poc.customGradlePlugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class CustomPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("myCustomTask1", MyCustomTask1.class);
    }
}
