package com.testfreemarker

import freemarker.template.Configuration
import freemarker.template.Template
import freemarker.template.TemplateExceptionHandler
import freemarker.template.Version

/**
 * The main entry point.
 */
class TestFreemarker {
	static void main(String[] args) {
		new TestFreemarker().run()
	}
	
	void run() {
		Map<String,String> textMap = [:]
		textMap.firstName = 'President Skrewb'
		
		Configuration cfg = new Configuration()
		cfg.setClassForTemplateLoading(TestFreemarker, "/")
		cfg.setIncompatibleImprovements(new Version(2, 3, 21))
		cfg.setDefaultEncoding('UTF-8')
		cfg.setLocale(Locale.US)
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER)
		
		Template template = cfg.getTemplate("test.ftl")
		Writer consoleWriter = new OutputStreamWriter(System.out)
		template.process(textMap, consoleWriter)
	}
}
