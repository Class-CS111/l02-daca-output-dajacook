// PARTNER NAME: Daniel Cook
// PARTNER NAME:
// CS111 SECTION #: 3033
// DATE: February 1, 2025

public class Main
{
	public static void main(String[] args)
	{
		//CONSTANTS SECTION
		final String ANSI_BG_RED = "\u001B[41m"; // unicode for red
		final String ANSI_BOLD = "\u001B[1m";
		final String ANSI_RESET = "\u001B[0m"; // unicode to reset or get rid of color background
		final String TITLE_USA = ANSI_BG_RED + ANSI_BOLD + "UNITED STATES OF AMERICA" + ANSI_RESET;
		// This code indicates that the red background will begin before (at) the title and end immediately after //
		final String CARD_TYPE = ANSI_BOLD + "EMPLOYMENT AUTHORIZATION CARD" + ANSI_RESET;
		final String SURNAME = ANSI_BOLD + "Surname" + ANSI_RESET;
		final String GIVEN_NAME = ANSI_BOLD + "Given Name" + ANSI_RESET;
		final String USCIS = ANSI_BOLD + "USCIS#" + ANSI_RESET;
		final String CATEGORY = ANSI_BOLD + "Category" + ANSI_RESET;
		final String CARD_NUM = ANSI_BOLD + "Card#" + ANSI_RESET;
		final String COUNTRY_OF_BIRTH = ANSI_BOLD + "Country of Birth" + ANSI_RESET;
		final String TERMS_AND_CONDITIONS = ANSI_BOLD + "Terms and Conditions" + ANSI_RESET;
		final String DOB = ANSI_BOLD + "Date of Birth" + ANSI_RESET;
		final String SEX = ANSI_BOLD + "Sex" + ANSI_RESET;
		final String VALID_DATE = ANSI_BOLD + "Valid From:" + ANSI_RESET;
		final String EXPIRE_DATE = ANSI_BOLD + "Card Expires:" + ANSI_RESET;
		final String REENTRY_NOTICE = ANSI_BOLD + "NOT VALID FOR REENTRY TO U.S." + ANSI_RESET;

		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, termsAndConditions, birthMonth;

		char sex;

		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, expireDay, expireMonth, expireYear,
		validDay, validMonth, validYear;
		surname = "COOK";
		givenName = "DANIEL";
		category = "C09";
		cardNum = "12345";
		birthCountry = "USA";
		termsAndConditions = "None";
		birthMonth = "OCT";
		sex = 'M';
		uscisNum1 = 123; uscisNum2 = 456; uscisNum3 = 789;
		birthDay = 15; birthYear = 1993;
		validDay = 01; validMonth = 01; validYear = 2025;
		expireDay = validDay; expireMonth = validMonth; expireYear = validYear+2;

		//INPUT SECTION

		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║         " + TITLE_USA + "                                     " + "║" + " ");
		System.out.println("║                                  " + CARD_TYPE + "       " + "║" + " ");
		System.out.println("║                       " + SURNAME + "                                        " + "║" + " ");
		System.out.println("║                       " + surname + "                                           " + "║" + " ");
		System.out.println("║  .----.    .----.     " + GIVEN_NAME + "                                     " + "║" + " ");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + "                                         " + "║" + " ");
		System.out.println("║        |  |           " + USCIS + "        " + CATEGORY + "   " + CARD_NUM + "                 " + "║" + " ");
		System.out.println("║       _/  \\_          " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "     " + category + "       "+ cardNum + "                " + "║" + " ");
		System.out.println("║      (_    _)         " + COUNTRY_OF_BIRTH + "                               " + "║" + " ");
		System.out.println("║   ,    `--`    ,      " + birthCountry + "                                            " + "║" + " ");
		System.out.println("║   \\'-.______.-'/      " + TERMS_AND_CONDITIONS + "                           " + "║" + " ");
		System.out.println("║    \\          /       " + termsAndConditions + "                                           " + "║" + " ");
		System.out.println("║     '.--..--.'        " + DOB + "   " + SEX + "                            " + "║" + " ");
		System.out.println("║       `\"\"\"\"\"`         " + birthDay + " " + birthMonth + " " + birthYear + "      " + sex + "                             " + "║" + " ");
		System.out.println("║                       " + VALID_DATE + "     " + validMonth + "/" + validDay + "/" + validYear + "                       " + "║" + " ");
		System.out.println("║                       " + EXPIRE_DATE + "   " + expireMonth + "/" + expireDay + "/" + expireYear + "                       " + "║" + " ");
		System.out.println("║ ascii art by: jgs     " + REENTRY_NOTICE + "                  " + "║" + " ");
		System.out.println("╚══════════════════════════════════════════════════════════════════════" + "╝");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}