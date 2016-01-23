package com.matthewcasperson.plugin.services.impl

import com.matthewcasperson.plugin.services.ApplyPlugins
import org.gradle.api.Project

/**
 * Created by Matthew on 23/01/2016.
 */
trait WebApplyPlugins implements ApplyPlugins {
    void applyPlugins(Project project) {
        assert project != null;
        project.applyPlugin('war');
        project.applyPlugin('maven');
        project.applyPlugin('sonar-runner');
    }
}