package com.rmd.media.reader.interactors

import com.rmd.media.reader.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
  suspend operator fun invoke() = documentRepository.getDocuments()
}
