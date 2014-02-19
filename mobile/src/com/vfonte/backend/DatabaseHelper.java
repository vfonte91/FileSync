package com.vfonte.backend;

/**
 * 
 * @author Vince Fonte
 *
 */
public interface DatabaseHelper {

	/**
	 * Returns the user accounts
	 *
	 * @return
	 */
	public String[] getAccounts();

	/**
	 * Adds a an authorized account to database
	 *
	 * @param name - name of account
	 * @return
	 */
	public boolean addAccount(String name);
}
