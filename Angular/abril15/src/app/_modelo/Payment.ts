import { ConventionalLoan } from "./ConventionalLoan";

export class Payment implements ConventionalLoan{
    principal: number;
    interestRate: number;
    months: number;
    constructor(principal: number, interestRate: number, months: number) {
      this.principal = principal;
      this.interestRate = interestRate;
      this.months = months;
    }
}