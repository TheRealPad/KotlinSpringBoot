package org.pad.documentmanagement.domain.auth

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import lombok.Getter
import lombok.Setter
import org.pad.documentmanagement.domain.enums.Role
import org.pad.documentmanagement.domain.structural.Instantiable

@Entity
@Getter
@Setter
class User : Instantiable() {

    var username: String? = null

    var password: String? = null

    @Enumerated(EnumType.STRING)
    var role: Role = Role.USER

}
