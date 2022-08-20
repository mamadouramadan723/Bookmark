package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.DocumentRepository
import com.rmd.media.reader.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {
  operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}