package util

import java.awt.Desktop
import java.io.File

fun loadImage() {
    val image = File("images\\rewritethestars.png")
    showImage(image)
}

fun showImage(image: File) {
    val desktop = Desktop.getDesktop()
    desktop.open(image)
}
