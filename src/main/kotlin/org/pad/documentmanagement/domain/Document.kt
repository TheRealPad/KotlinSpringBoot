package org.pad.documentmanagement.domain

import jakarta.persistence.Entity
import lombok.Getter
import lombok.Setter
import org.pad.documentmanagement.domain.structural.Instantiable

@Entity
@Getter
@Setter
class Document : Instantiable() {
     var title: String? = null
}
