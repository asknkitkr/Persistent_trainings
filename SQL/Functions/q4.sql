SELECT substr(meter_number, 1, 3) as meter_code
FROM meter
ORDER BY meter_code DESC;
