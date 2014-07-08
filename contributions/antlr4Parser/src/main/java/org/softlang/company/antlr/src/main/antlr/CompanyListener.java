// Generated from src/main/antlr/Company.g4 by ANTLR 4.2.2

package org.softlang.company.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompanyParser}.
 */
public interface CompanyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompanyParser#company}.
	 * @param ctx the parse tree
	 */
	void enterCompany(@NotNull CompanyParser.CompanyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompanyParser#company}.
	 * @param ctx the parse tree
	 */
	void exitCompany(@NotNull CompanyParser.CompanyContext ctx);

	/**
	 * Enter a parse tree produced by {@link CompanyParser#department}.
	 * @param ctx the parse tree
	 */
	void enterDepartment(@NotNull CompanyParser.DepartmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompanyParser#department}.
	 * @param ctx the parse tree
	 */
	void exitDepartment(@NotNull CompanyParser.DepartmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link CompanyParser#employee}.
	 * @param ctx the parse tree
	 */
	void enterEmployee(@NotNull CompanyParser.EmployeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompanyParser#employee}.
	 * @param ctx the parse tree
	 */
	void exitEmployee(@NotNull CompanyParser.EmployeeContext ctx);
}