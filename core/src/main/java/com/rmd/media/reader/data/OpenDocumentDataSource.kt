package com.rmd.media.reader.data

import com.rmd.media.reader.domain.Document

interface OpenDocumentDataSource {

  fun setOpenDocument(document: Document)

  fun getOpenDocument(): Document
}