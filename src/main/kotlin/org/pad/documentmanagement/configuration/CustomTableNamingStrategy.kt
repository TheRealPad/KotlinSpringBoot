package org.pad.documentmanagement.configuration

import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy
import org.hibernate.boot.model.naming.Identifier
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment

class CustomTableNamingStrategy : CamelCaseToUnderscoresNamingStrategy() {

    override fun toPhysicalTableName(name: Identifier, context: JdbcEnvironment?): Identifier {
        val prefixedName = "pad_" + name.text
        return Identifier.toIdentifier(prefixedName)
    }
}
