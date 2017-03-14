var values = [-1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 ];
		var x = -0.231;
		var y = 41.25;
		var a, b, c;

		for (var index = 0; index < values.length; index++) {

			c = index + 1;
			a = (c * c) + y;
			b = values[index] * c;
			if (values[index] < x) {
				process.stdout.write(a + ", ");

			}

			if (values[index] > x) {
				process.stdout.write(b + ", ");
			}

		}
