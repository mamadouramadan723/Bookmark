package com.rmd.media.reader.domain

import java.io.Serializable

data class Document(
    val url: String,
    val name: String,
    val size: Int,
    val thumbnail: String
): Serializable {
  companion object {
    val EMPTY = Document("", "", 0, "")
  }
}