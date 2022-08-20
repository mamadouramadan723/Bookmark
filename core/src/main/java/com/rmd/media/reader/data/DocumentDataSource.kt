package com.rmd.media.reader.data

import com.rmd.media.reader.domain.Document

interface DocumentDataSource {

  suspend fun add(document: Document)

  suspend fun readAll(): List<Document>

  suspend fun remove(document: Document)
}