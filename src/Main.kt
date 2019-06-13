package uk.co.xsc.workoutmonitor.screen

import javafx.geometry.Pos
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.TextAlignment
import javafx.stage.Stage
import tornadofx.*

class WorkoutMonitorApp : App(MainMenuScreen::class, Styles::class) {

    private var w = 600.0
    private var h = 800.0

    private var stage: Stage? = null

    override fun start(stage: Stage) {
        super.start(stage)
        this.stage = stage
        stage.resizableProperty().set(false)
        stage.width = w
        stage.height = h
    }

    fun reloadSize() {
        this.stage!!.width = w
        this.stage!!.height = h
    }

}

class Styles : Stylesheet() {

    val bgColor: javafx.scene.paint.Color = c("#111222")
    val fgColor: javafx.scene.paint.Color = c("#fcfcfc")

    val main_menu_header_label by cssclass()

    val main_menu_stats_button by cssclass()
    val main_menu_templates_button by cssclass()
    val main_menu_workout_button by cssclass()

    val main_menu_vbox by cssclass()

    init {
        label {
            textFill = fgColor
            font = Font.font("Calibri", FontWeight.LIGHT, 14.0)
            wrapText = true

            and(main_menu_header_label) {
                textAlignment = TextAlignment.CENTER
                fontSize = 28.pt
                padding = CssBox(0.px, 0.px, 30.px, 0.px)
            }
        }
        button {
            borderWidth += box(5.px)
            borderRadius += box(100.px)
            borderColor += box(fgColor)

            font = Font.font("Calibri", FontWeight.LIGHT, 24.0)
            textFill = fgColor
            backgroundColor += c("#000")
            textAlignment = TextAlignment.CENTER
            backgroundRadius += box(100.px)
            minWidth = 420.px
            prefWidth = 420.px

            and(main_menu_stats_button) {
                backgroundColor += c("#ff5561")
                borderColor += CssBox(c("#ff5561"), c("#ff5561"), c("#ff5561"), c("#ff5561"))
                and(hover) {
                    backgroundColor += fgColor
                    textFill = bgColor
                    prefWidth = 450.px
                    maxWidth = 450.px
                }
                and(pressed) {
                    rotate = 10.deg
                }
            }
            and(main_menu_templates_button) {
                backgroundColor += c("#ffce34")
                borderColor += CssBox(c("#ffce34"), c("#ffce34"), c("#ffce34"), c("#ffce34"))
                and(hover) {
                    backgroundColor += fgColor
                    textFill = bgColor
                    prefWidth = 450.px
                    maxWidth = 450.px
                }
                and(pressed) {
                    rotate = 10.deg
                }
            }
            and(main_menu_workout_button) {
                backgroundColor += c("#44fc66")
                borderColor += CssBox(c("#44fc66"), c("#44fc66"), c("#44fc66"), c("#44fc66"))
                and(hover) {
                    backgroundColor += fgColor
                    textFill = bgColor
                    prefWidth = 450.px
                    maxWidth = 450.px
                }
                and(pressed) {
                    rotate = 10.deg
                }
            }

        }
        main_menu_vbox {
            padding = CssBox(110.px, 50.px, 50.px, 50.px)
            spacing = 60.px
            alignment = Pos.TOP_CENTER
            backgroundColor += bgColor
        }
    }
}