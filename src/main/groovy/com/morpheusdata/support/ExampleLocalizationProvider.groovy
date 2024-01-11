package com.morpheusdata.support

import com.morpheusdata.core.MorpheusContext
import com.morpheusdata.core.Plugin
import com.morpheusdata.core.providers.LocalizationProvider
import com.morpheusdata.model.User
import com.morpheusdata.model.CustomLocale


class ExampleLocalizationProvider implements LocalizationProvider {
	protected MorpheusContext morpheusContext
	protected Plugin plugin

	ExampleLocalizationProvider(Plugin plugin, MorpheusContext morpheusContext) {
		this.morpheusContext = morpheusContext
		this.plugin = plugin
	}

	List<CustomLocale> getCustomLocales(User user) {
		return getCustomLocales()
	}

	List<CustomLocale> getCustomLocales() {
		return [new CustomLocale("Klingon", "klingon")]
	}

	/**
	 * Returns the Morpheus Context for interacting with data stored in the Main Morpheus Application
	 *
	 * @return an implementation of the MorpheusContext for running Future based rxJava queries
	 */
	@Override
	MorpheusContext getMorpheus() {
		return this.morpheusContext
	}

	/**
	 * Returns the instance of the Plugin class that this provider is loaded from
	 * @return Plugin class contains references to other providers
	 */
	@Override
	Plugin getPlugin() {
		return this.plugin
	}

	/**
	 * A unique shortcode used for referencing the provided provider. Make sure this is going to be unique as any data
	 * that is seeded or generated related to this provider will reference it by this code.
	 * @return short code string that should be unique across all other plugin implementations.
	 */
	@Override
	String getCode() {
		return "exampleMessageProviderPluginLocalizationProvider"
	}

	/**
	 * Provides the provider name for reference when adding to the Morpheus Orchestrator
	 * NOTE: This may be useful to set as an i18n key for UI reference and localization support.
	 *
	 * @return either an English name of a Provider or an i18n based key that can be scanned for in a properties file.
	 */
	@Override
	String getName() {
		return "Example Localization Message Provider Plugin"
	}
}
