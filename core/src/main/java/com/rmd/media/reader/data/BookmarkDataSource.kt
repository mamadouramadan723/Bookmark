package com.rmd.media.reader.data

import com.rmd.media.reader.domain.Bookmark
import com.rmd.media.reader.domain.Document

interface BookmarkDataSource {

  suspend fun add(document: Document, bookmark: Bookmark)

  suspend fun read(document: Document): List<Bookmark>

  suspend fun remove(document: Document, bookmark: Bookmark)
}