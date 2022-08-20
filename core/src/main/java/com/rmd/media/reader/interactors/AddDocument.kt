package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.DocumentRepository
import com.rmd.media.reader.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}
