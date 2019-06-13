package uk.co.xsc.workoutmonitor.screen

import javafx.scene.Parent
import tornadofx.*

class MainMenuScreen() : View() {

    override val root: Parent = stackpane {
        vbox {
            label("What would you like to do today?").addClass("main_menu_header_label")
            button("View stats").addClass("main_menu_stats_button")
            button("Manage workout templates").addClass("main_menu_templates_button")
            button("Start workout").addClass("main_menu_workout_button")
        }.addClass("main_menu_vbox")
        group {

        }
    }

}