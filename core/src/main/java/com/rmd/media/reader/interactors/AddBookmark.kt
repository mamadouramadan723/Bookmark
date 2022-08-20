package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.BookmarkRepository
import com.rmd.media.reader.domain.Bookmark
import com.rmd.media.reader.domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {
  suspend operator fun invoke(document: Document, bookmark: Bookmark) =
      bookmarkRepository.addBookmark(document, bookmark)
}