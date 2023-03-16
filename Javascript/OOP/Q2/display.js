function isPrime(num) {
  if (num <= 1) {
    return "Neither Prime nor Composite";
  }

  for (let i = 2; i <= Math.sqrt(num); i++) {
    if (num % i === 0) {
      return "Composite Number";
    }
  }
  return "Prime Number";
}

exports.isPrime = isPrime;
