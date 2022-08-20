package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.BookmarkRepository
import com.rmd.media.reader.domain.Bookmark
import com.rmd.media.reader.domain.Document

class RemoveBookmark(private val bookmarksRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarksRepository
      .removeBookmark(document, bookmark)
}