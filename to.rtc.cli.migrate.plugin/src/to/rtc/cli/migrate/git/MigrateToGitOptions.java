/**
 *
 */
package to.rtc.cli.migrate.git;

import com.ibm.team.rtc.cli.infrastructure.internal.parser.IOptionKey;
import com.ibm.team.rtc.cli.infrastructure.internal.parser.NamedOptionDefinition;
import com.ibm.team.rtc.cli.infrastructure.internal.parser.OptionKey;
import com.ibm.team.rtc.cli.infrastructure.internal.parser.Options;
import com.ibm.team.rtc.cli.infrastructure.internal.parser.exceptions.ConflictingOptionException;

import to.rtc.cli.migrate.MigrateToOptions;

/**
 * @author florian.buehlmann
 *
 */
public class MigrateToGitOptions extends MigrateToOptions {

	
	public static final IOptionKey OPT_MIGRATION_PROPERTIES = new OptionKey("migrationProperties"); //$NON-NLS-1$
	
	@Override
	public Options getOptions() throws ConflictingOptionException {
		Options options = super.getOptions();

		// rtc2git migration properties
		options.addOption(new NamedOptionDefinition(OPT_MIGRATION_PROPERTIES, "m", "migrationProperties", 1),
				"File with migration properties.");
		return options;
	}

}
