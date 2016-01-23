package com.matthewcasperson.plugin.services.impl

import com.matthewcasperson.plugin.services.CustomizeLocations
import org.gradle.api.Project

/**
 * Created by Matthew on 23/01/2016.
 */
trait WebCustomizeLocations implements CustomizeLocations {
    void customizeLocations(Project project) {
        assert project != null;
        project.webAppDirName = 'WebContent';
    }
}