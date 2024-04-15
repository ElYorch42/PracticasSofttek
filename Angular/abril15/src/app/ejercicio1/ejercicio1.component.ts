import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Payment } from '../_modelo/Payment';
import { ConventionalLoan } from '../_modelo/ConventionalLoan';
import { Loan } from '../_modelo/Loan';


@Component({
  selector: 'app-ejercicio1',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './ejercicio1.component.html',
  styleUrl: './ejercicio1.component.css',
})
export class Ejercicio1Component {
  calculateInterestOnlyLoanPayment(loan: Loan) {
    // Calculates the monthly payment of an interest only loan
    let interest = loan.interestRate / 1200; // Calculates the Monthly Interest Rate of the
    loan;
    let payment;
    payment = loan.principal * interest;
    return 'The interest only loan payment is ' + payment.toFixed(2);
  }

  calculateConventionalLoanPayment(loan: ConventionalLoan) {
    // Calculates the monthly payment of a conventional loan
    let interest = loan.interestRate / 1200; // Calculates the Monthly Interest Rate of the
    loan;
    let payment;
    payment =
      (loan.principal * interest) /
      (1 - Math.pow(1 / (1 + interest), loan.months));
    return 'The conventional loan payment is ' + payment.toFixed(2);
  }

  pago : Payment = new Payment(30000,5,180);

  calcular() {
    
    let interestOnlyPayment = this.calculateInterestOnlyLoanPayment(this.pago);

    let conventionalPayment = this.calculateConventionalLoanPayment(this.pago);

    console.log(interestOnlyPayment); //* Returns "The interest only loan payment is 125.00"
    console.log(conventionalPayment); //* Returns "The conventional loan payment is 237.24"
  }
}
