package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke() = documentRepository.getOpenDocument()
}
