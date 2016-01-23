package com.matthewcasperson.plugin

import com.matthewcasperson.plugin.services.impl.SharedConfigureMaven
import com.matthewcasperson.plugin.services.impl.SharedConfigureSonarQube
import com.matthewcasperson.plugin.services.impl.WebApplyPlugins
import com.matthewcasperson.plugin.services.impl.WebCustomizeLocations
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Matthew on 23/01/2016.
 */
class WebPlugin implements
        Plugin<Project>,
        WebApplyPlugins,
        WebCustomizeLocations,
        SharedConfigureMaven,
        SharedConfigureSonarQube   {

    void apply(Project project) {
        applyPlugins(project);
        customizeLocations(project);
        configureMaven(project);
        configureSonarQube(project);
    }
}