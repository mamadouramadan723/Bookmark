package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.BookmarkRepository
import com.rmd.media.reader.domain.Document

class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {

  suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}