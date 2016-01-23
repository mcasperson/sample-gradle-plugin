package com.matthewcasperson.plugin

import com.matthewcasperson.plugin.services.impl.DesktopApplyPlugins
import com.matthewcasperson.plugin.services.impl.SharedConfigureMaven
import com.matthewcasperson.plugin.services.impl.SharedConfigureSonarQube
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Matthew on 23/01/2016.
 */
class DesktopPlugin implements
        Plugin<Project>,
        DesktopApplyPlugins,
        SharedConfigureMaven,
        SharedConfigureSonarQube   {

    void apply(Project project) {
        applyPlugins(project);
        configureMaven(project);
        configureSonarQube(project);
    }
}